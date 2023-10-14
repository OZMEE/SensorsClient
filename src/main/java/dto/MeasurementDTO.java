package dto;

public class MeasurementDTO {
    private float value;
    private boolean raining;
    private SensorDTO sensor;

    public MeasurementDTO(float value, boolean raining, SensorDTO sensorDTO){
        this.value = value;
        this.raining = raining;
        this.sensor = sensorDTO;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public boolean isRaining() {
        return raining;
    }

    public void setRaining(boolean raining) {
        this.raining = raining;
    }

    public SensorDTO getSensor() {
        return sensor;
    }

    public void setSensor(SensorDTO sensor) {
        this.sensor = sensor;
    }
}
