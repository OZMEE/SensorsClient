import dto.SensorDTO;
import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

public class SensorsManager {
    public static void sendSensor(String name, String url){
        RestTemplate restTemplate = new RestTemplate();
        SensorDTO sensorDTO = new SensorDTO(name);
        HttpEntity<SensorDTO> request = new HttpEntity<>(sensorDTO);
        String response = restTemplate.postForObject(url, sensorDTO, String.class);
    }
}
