package roxorgaming.paulkane.client.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MyMoreComplexBean {
    private MyBean myBean;
}
