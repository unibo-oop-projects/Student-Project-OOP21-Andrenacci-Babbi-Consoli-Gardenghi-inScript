package jsonparser;

import java.util.Optional;

import cards.Effect;

public interface InfoEffect {

    String getName();
    
    Optional<Effect> generateInfoEffect();

}
