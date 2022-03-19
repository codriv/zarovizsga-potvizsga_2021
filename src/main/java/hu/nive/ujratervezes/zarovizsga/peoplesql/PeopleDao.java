package hu.nive.ujratervezes.zarovizsga.peoplesql;

import org.mariadb.jdbc.MariaDbDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class PeopleDao {

    private JdbcTemplate jdbcTemplate;

    public PeopleDao(MariaDbDataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public String findIpByName(String firstName, String lastName) {
        return jdbcTemplate.query("select ip_address from people where first_name = ? and last_name = ?",
                (rs, rowNum) -> rs.getString("ip_address"), firstName, lastName).get(0);
    }
}
