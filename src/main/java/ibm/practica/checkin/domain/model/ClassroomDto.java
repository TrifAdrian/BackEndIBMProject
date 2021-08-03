package ibm.practica.checkin.domain.model;



import java.util.List;


public final class ClassroomDto {

    private Long id;
    private String name;
    private String location;
    private Integer capacity;
    private List<FeatureDto> features_list;

    public ClassroomDto() {
    }

    public ClassroomDto(Long id, String name, String location, Integer capacity) {
        this.id = id;

        this.name = name;
        this.location = location;
        this.capacity = capacity;
    }

    public ClassroomDto(Long id, String name, String location, Integer capacity, List<FeatureDto> features_list) {
        this.id = id;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
