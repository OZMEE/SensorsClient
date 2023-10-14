import dto.SensorDTO;

public class Client {
    public static void main(String[] args){
        SensorDTO sensorDTO = new SensorDTO("Sensor1");
        for(int i = 0; i<1000; i++){
            MeasurementsManager.sendMeasurement(sensorDTO, "http://localhost:8080/measurements/add");
        }
        SensorsManager.sendSensor("Sensor2", "http://localhost:8080/sensors/registration");
    }
}
