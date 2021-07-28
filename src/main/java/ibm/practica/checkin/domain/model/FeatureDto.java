package ibm.practica.checkin.domain.model;



public final class FeatureDto {

    private String name;

    public FeatureDto() {
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
