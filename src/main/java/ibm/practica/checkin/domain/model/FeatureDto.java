package ibm.practica.checkin.domain.model;



public final class FeatureDto {

    private Long id;
    private String name;


    public FeatureDto(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    public FeatureDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FeatureDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
