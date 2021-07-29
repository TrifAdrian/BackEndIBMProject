package ibm.practica.checkin.domain.model;



import java.util.List;


public final class ClassroomDto {

    private String name;
    private String location;
    private Integer capacity;
    private List<FeatureDto> features_list;

    public ClassroomDto() {
    }

    public ClassroomDto(String name, String location, Integer capacity, List<FeatureDto> features_list) {
        this.name = name;
        this.location = location;
        this.capacity = capacity;
        this.features_list = features_list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public List<FeatureDto> getFeatures_list() {
        return features_list;
    }

    public void setFeatures_list(List<FeatureDto> features_list) {
        this.features_list = features_list;
    }
}
