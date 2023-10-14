import dto.MeasurementDTO;
import dto.SensorDTO;
import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Random;

public class MeasurementsManager {
    public static MeasurementDTO generateMeasurement(SensorDTO sensorDTO){
        Random random = new Random();
        float a = random.nextFloat()*100*(random.nextInt(2)<1 ? -1 : 1);
        boolean raining = random.nextBoolean();
        return new MeasurementDTO(a, raining, sensorDTO);
    }

    public static void sendMeasurement(SensorDTO sensorDTO, String url){
        RestTemplate restTemplate = new RestTemplate();
        MeasurementDTO measurementDTO = generateMeasurement(sensorDTO);

        HttpEntity<MeasurementDTO> request = new HttpEntity<>(measurementDTO);

        String response = restTemplate.postForObject(url, request, String.class);
    }
}
