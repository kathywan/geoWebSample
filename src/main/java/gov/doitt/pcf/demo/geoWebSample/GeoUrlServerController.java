package gov.doitt.pcf.demo.geoWebSample;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/urls")
public class GeoUrlServerController {

    @Value("${geoUrls.bseWmsUrl}")
    private String bseWmsUrl;

    @Value("${geoUrls.geoClientUrl}")
    private String geoClientUrl;

    @RequestMapping("/bseWms")
    String getBseWmsUrl(Model model) {
        return bseWmsUrl;
    }

    @RequestMapping("/geoClient")
    String getGeoClientUrl(Model model) {
        return geoClientUrl;
    }
}