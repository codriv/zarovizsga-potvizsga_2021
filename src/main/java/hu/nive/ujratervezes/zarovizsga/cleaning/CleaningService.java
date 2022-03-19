package hu.nive.ujratervezes.zarovizsga.cleaning;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CleaningService {

    private Set<Cleanable> cleanables = new LinkedHashSet<>();

    public void add(Cleanable cleanable) {
        cleanables.add(cleanable);
    }

    public Set<Cleanable> getCleanables() {
        return cleanables;
    }

    public int cleanAll() {
        int sum = cleanables.stream().mapToInt(Cleanable::clean).sum();
        cleanables.clear();
        return sum;
    }

    public int cleanOnlyOffices() {
        int sum = cleanables.stream().filter(cleanable -> cleanable instanceof Office).mapToInt(Cleanable::clean).sum();
        cleanables.removeIf(cleanable -> cleanable instanceof Office);
        return sum;
    }

    public List<Cleanable> findByAddressPart(String address) {
        return cleanables.stream().filter(cleanable -> cleanable.getAddress().contains(address)).collect(Collectors.toList());
    }

    public String getAddresses() {
        return cleanables.stream().map(Cleanable::getAddress).collect(Collectors.joining(", "));
    }


}
