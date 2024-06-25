package api.qa.Techtorial.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @JsonIgnoreProperties(ignoreUnknown = true)
public class PJ_AppLoginData {

    private String token;

    private PJ_AppLoginUser user;
}
