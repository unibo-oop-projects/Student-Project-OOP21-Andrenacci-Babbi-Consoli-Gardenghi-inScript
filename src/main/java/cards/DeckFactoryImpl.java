package cards;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import effects.Armored;
import effects.Elusive;
import effects.Growth;
import effects.Healer;
import effects.Poison;
import shared.CardIDgenerator;
import shared.CardIDgeneratorImpl;

public class DeckFactoryImpl implements DeckFactory {
    
    final List<Card> playerDeck = new ArrayList<>();
    final List<Card> playerIADeck = new ArrayList<>();
    final List<Card> maisDeck = new ArrayList<>();
    final List<Card> shinobiDeck = new ArrayList<>();
    final Map<String, List<Card>> DeckList = new HashMap<String, List<Card>>();
    final CardIDgenerator idGenerator = CardIDgeneratorImpl.getIntance();
    
    @Override
    public Map<String, List<Card>> getDecks() {
        
        this.DeckList.put("deck-standard", getPlayerDeck());
        this.DeckList.put("deck-standard-IA", getPlayerIADeck());
        this.DeckList.put("deck-mais", getMaisDeck());
        this.DeckList.put("deck-shinobi", getShinobiDeck());
        
        return DeckList;
    }

    private List<Card> getPlayerDeck() {
        
        this.playerDeck.add(new CardFactoyImpl().noEffect(idGenerator.generateID(), "Cane", 1, 1, 1));
        this.playerDeck.add(new CardFactoyImpl().noEffect(idGenerator.generateID(), "Cane", 1, 1, 1));
        this.playerDeck.add(new CardFactoyImpl().poisonEffect(idGenerator.generateID(), "Vipera", 1, 1, 2));
        this.playerDeck.add(new CardFactoyImpl().healerEffect(idGenerator.generateID(), "Calendula", 2, 0, 1));
        this.playerDeck.add(new CardFactoyImpl().healerEffect(idGenerator.generateID(), "Calendula", 2, 0, 1));
        this.playerDeck.add(new CardFactoyImpl().noEffect(idGenerator.generateID(), "Sasso", 4, 0, 2));
        this.playerDeck.add(new CardFactoyImpl().noEffect(idGenerator.generateID(), "Sasso", 4, 0, 2));
        this.playerDeck.add(new CardFactoyImpl().exaltedEffect(idGenerator.generateID(), "Corteo no Vax", 1, 3, 4));
        this.playerDeck.add(new CardFactoyImpl().exaltedEffect(idGenerator.generateID(), "Corteo no Vax", 1, 3, 4));
        this.playerDeck.add(new CardFactoyImpl().exaltedEffect(idGenerator.generateID(), "Terrapiattista", 1, 1, 2));
        this.playerDeck.add(new CardFactoyImpl().drawEffect(idGenerator.generateID(), "Studiato", 1, 1, 2));
        this.playerDeck.add(new CardFactoyImpl().drawEffect(idGenerator.generateID(), "Pesca", 1, 1, 2));
        this.playerDeck.add(new CardFactoyImpl().drawEffect(idGenerator.generateID(), "Pesca", 1, 1, 2));
        this.playerDeck.add(new CardFactoyImpl().elusiveEffect(idGenerator.generateID(), "Ladro", 1, 3, 3));
        this.playerDeck.add(new CardFactoyImpl().growthEffect(idGenerator.generateID(), "Lucertola Rossa", 1, 1, 3, "Coccodrillo Rosso", 3, 3, Optional.empty()));
        this.playerDeck.add(new CardFactoyImpl().growthEffect(idGenerator.generateID(), "Lucertola Rossa", 1, 1, 3, "Coccodrillo Rosso", 3, 3, Optional.empty()));
        this.playerDeck.add(new CardFactoyImpl().armoredEffect(idGenerator.generateID(), "G3n0s", 4, 1, 5));
        this.playerDeck.add(new CardFactoyImpl().healerEffect(idGenerator.generateID(), "Chierico", 3, 2, 3));
        this.playerDeck.add(new CardFactoyImpl().armoredEffect(idGenerator.generateID(), "Templare", 2, 4, 5));
        this.playerDeck.add(new CardFactoyImpl().noEffect(idGenerator.generateID(), "Dinosauro", 6, 6, 6));
        
        return this.playerDeck;
    }

    private List<Card> getPlayerIADeck() {
        
        this.playerIADeck.add(new CardFactoyImpl().noEffect(idGenerator.generateID(), "Cane", 1, 1, 1));
        this.playerIADeck.add(new CardFactoyImpl().noEffect(idGenerator.generateID(), "Cane", 1, 1, 1));
        this.playerIADeck.add(new CardFactoyImpl().healerEffect(idGenerator.generateID(), "Calendula", 2, 0, 1));
        this.playerIADeck.add(new CardFactoyImpl().healerEffect(idGenerator.generateID(), "Calendula", 2, 0, 1));
        this.playerIADeck.add(new CardFactoyImpl().noEffect(idGenerator.generateID(), "Sasso", 4, 0, 2));
        this.playerIADeck.add(new CardFactoyImpl().noEffect(idGenerator.generateID(), "Sasso", 4, 0, 2));
        this.playerIADeck.add(new CardFactoyImpl().exaltedEffect(idGenerator.generateID(), "Corteo no Vax", 1, 3, 4));
        this.playerIADeck.add(new CardFactoyImpl().exaltedEffect(idGenerator.generateID(), "Corteo no Vax", 1, 3, 4));
        this.playerIADeck.add(new CardFactoyImpl().exaltedEffect(idGenerator.generateID(), "Terrapiattista", 1, 1, 2));
        this.playerIADeck.add(new CardFactoyImpl().poisonEffect(idGenerator.generateID(), "Ratto", 2, 1, 3));
        this.playerIADeck.add(new CardFactoyImpl().drawEffect(idGenerator.generateID(), "Studiato", 1, 1, 2));
        this.playerIADeck.add(new CardFactoyImpl().drawEffect(idGenerator.generateID(), "Pesca", 1, 1, 2));
        this.playerIADeck.add(new CardFactoyImpl().drawEffect(idGenerator.generateID(), "Pesca", 1, 1, 2));
        this.playerIADeck.add(new CardFactoyImpl().elusiveEffect(idGenerator.generateID(), "Mimic", 3, 2, 4));
        this.playerIADeck.add(new CardFactoyImpl().rottenEffect(idGenerator.generateID(), "Melma", 4, 2, 4));
        this.playerIADeck.add(new CardFactoyImpl().rottenEffect(idGenerator.generateID(), "Melma", 4, 2, 4));
        this.playerIADeck.add(new CardFactoyImpl().rottenEffect(idGenerator.generateID(), "Mummia", 1, 4, 3));
        this.playerIADeck.add(new CardFactoyImpl().rottenEffect(idGenerator.generateID(), "Mummia", 1, 4, 3));
        this.playerIADeck.add(new CardFactoyImpl().growthEffect(idGenerator.generateID(), "Guts", 1, 4, 3, "Berserk", 2, 5, Optional.of(new Elusive())));
        this.playerIADeck.add(new CardFactoyImpl().growthEffect(idGenerator.generateID(), "Uovo", 8, 0, 8, "Fafnir Drago Antico", 8, 8, Optional.of(new Armored())));
        
        return this.playerIADeck;
    }
    
    private List<Card> getMaisDeck(){
        
        this.maisDeck.add(new CardFactoyImpl().drawEffect(idGenerator.generateID(), "Mais", 1, 0, 1));
        this.maisDeck.add(new CardFactoyImpl().drawEffect(idGenerator.generateID(), "Mais", 1, 0, 1));
        this.maisDeck.add(new CardFactoyImpl().drawEffect(idGenerator.generateID(), "Mais", 1, 0, 1));
        this.maisDeck.add(new CardFactoyImpl().drawEffect(idGenerator.generateID(), "Mais", 1, 0, 1));
        this.maisDeck.add(new CardFactoyImpl().drawEffect(idGenerator.generateID(), "Mais", 1, 0, 1));
        
        this.maisDeck.add(new CardFactoyImpl().drawEffect(idGenerator.generateID(), "Mais", 1, 0, 1));
        this.maisDeck.add(new CardFactoyImpl().drawEffect(idGenerator.generateID(), "Mais", 1, 0, 1));
        this.maisDeck.add(new CardFactoyImpl().drawEffect(idGenerator.generateID(), "Mais", 1, 0, 1));
        this.maisDeck.add(new CardFactoyImpl().drawEffect(idGenerator.generateID(), "Mais", 1, 0, 1));
        this.maisDeck.add(new CardFactoyImpl().drawEffect(idGenerator.generateID(), "Mais", 1, 0, 1));
        
        this.maisDeck.add(new CardFactoyImpl().healerEffect(idGenerator.generateID(), "Granaio", 4, 0, 2));
        this.maisDeck.add(new CardFactoyImpl().healerEffect(idGenerator.generateID(), "Granaio", 4, 0, 2));
        this.maisDeck.add(new CardFactoyImpl().elusiveEffect(idGenerator.generateID(), "Doppleganger-Mais", 2, 1, 2));
        this.maisDeck.add(new CardFactoyImpl().elusiveEffect(idGenerator.generateID(), "Doppleganger-Mais", 2, 1, 2));
        this.maisDeck.add(new CardFactoyImpl().exaltedEffect(idGenerator.generateID(), "Spaventapasseri", 1, 2, 3));
        
        this.maisDeck.add(new CardFactoyImpl().exaltedEffect(idGenerator.generateID(), "Spaventapasseri", 1, 2, 3));
        this.maisDeck.add(new CardFactoyImpl().exaltedEffect(idGenerator.generateID(), "Spaventapasseri", 1, 2, 3));
        this.maisDeck.add(new CardFactoyImpl().armoredEffect(idGenerator.generateID(), "Cavaglieri di Mais", 3, 1, 3));
        this.maisDeck.add(new CardFactoyImpl().armoredEffect(idGenerator.generateID(), "Cavaglieri di Mais", 3, 1, 3));
        this.maisDeck.add(new CardFactoyImpl().armoredEffect(idGenerator.generateID(), "Cavaglieri di Mais", 3, 1, 3));
        
        this.maisDeck.add(new CardFactoyImpl().growthEffect(idGenerator.generateID(), "Mulino", 3, 0, 4, "Gigante", 4, 4,  Optional.empty()));
        this.maisDeck.add(new CardFactoyImpl().growthEffect(idGenerator.generateID(), "Mulino", 3, 0, 4, "Gigante", 4, 4,  Optional.empty()));
        this.maisDeck.add(new CardFactoyImpl().noEffect(idGenerator.generateID(), "Khael Mais Lich", 4, 3, 4));
        this.maisDeck.add(new CardFactoyImpl().noEffect(idGenerator.generateID(), "Khael Mais Lich", 4, 3, 4));
        this.maisDeck.add(new CardFactoyImpl().growthEffect(idGenerator.generateID(), "Chiesa del Mais", 5, 0, 5, "Cattedrale del Mais", 10, 0, Optional.of(new Healer())));
        
        this.maisDeck.add(new CardFactoyImpl().armoredEffect(idGenerator.generateID(), "il fattore", 5, 2, 5));
        this.maisDeck.add(new CardFactoyImpl().armoredEffect(idGenerator.generateID(), "il fattore", 5, 2, 5));
        this.maisDeck.add(new CardFactoyImpl().growthEffect(idGenerator.generateID(), "Mietitrebbia", 4, 0, 7, "Cupo Mietitore", 8, 8, Optional.of(new Poison())));
        this.maisDeck.add(new CardFactoyImpl().growthEffect(idGenerator.generateID(), "Mietritrebbia", 4, 0, 7, "Cupo Mietitore", 8, 8, Optional.of(new Poison())));
        this.maisDeck.add(new CardFactoyImpl().noEffect(idGenerator.generateID(), "MAISxodia il proibito", 10, 10, 10));
       
        return this.maisDeck;
    }
    
    private List<Card> getShinobiDeck() {
        
        this.shinobiDeck.add(new CardFactoyImpl().drawEffect(idGenerator.generateID(), "Studente Accademia", 1, 1, 2));
        this.shinobiDeck.add(new CardFactoyImpl().drawEffect(idGenerator.generateID(), "Studente Accademia", 1, 1, 2));
        this.shinobiDeck.add(new CardFactoyImpl().drawEffect(idGenerator.generateID(), "Studente Accademia", 1, 1, 2));
        
        this.shinobiDeck.add(new CardFactoyImpl().noEffect(idGenerator.generateID(), "Genin", 1, 2, 1));
        this.shinobiDeck.add(new CardFactoyImpl().noEffect(idGenerator.generateID(), "Genin", 1, 2, 1));
        this.shinobiDeck.add(new CardFactoyImpl().noEffect(idGenerator.generateID(), "Genin", 1, 2, 1));
        
        this.shinobiDeck.add(new CardFactoyImpl().healerEffect(idGenerator.generateID(), "Ninja Medico", 3, 0, 2));
        this.shinobiDeck.add(new CardFactoyImpl().healerEffect(idGenerator.generateID(), "Ninja Medico", 3, 0, 2));
        
        this.shinobiDeck.add(new CardFactoyImpl().healerEffect(idGenerator.generateID(), "Copia Sakura", 3, 2, 2));
        this.shinobiDeck.add(new CardFactoyImpl().healerEffect(idGenerator.generateID(), "Copia Sakura", 3, 2, 2));
        this.shinobiDeck.add(new CardFactoyImpl().healerEffect(idGenerator.generateID(), "Copia Sakura", 3, 2, 2));
        
        this.shinobiDeck.add(new CardFactoyImpl().exaltedEffect(idGenerator.generateID(), "Chunin", 1, 4, 3));
        this.shinobiDeck.add(new CardFactoyImpl().exaltedEffect(idGenerator.generateID(), "Chunin", 1, 4, 3));
        this.shinobiDeck.add(new CardFactoyImpl().exaltedEffect(idGenerator.generateID(), "Chunin", 1, 4, 3));
        
        this.shinobiDeck.add(new CardFactoyImpl().noEffect(idGenerator.generateID(), "Jonin", 5, 1, 4));
        this.shinobiDeck.add(new CardFactoyImpl().noEffect(idGenerator.generateID(), "Jonin", 5, 1, 4));
        
        this.shinobiDeck.add(new CardFactoyImpl().elusiveEffect(idGenerator.generateID(), "Ninja Traditore", 3, 2, 4));
        this.shinobiDeck.add(new CardFactoyImpl().elusiveEffect(idGenerator.generateID(), "Ninja Traditore", 3, 2, 4));
        this.shinobiDeck.add(new CardFactoyImpl().elusiveEffect(idGenerator.generateID(), "Ninja Traditore", 3, 2, 4));
        
        this.shinobiDeck.add(new CardFactoyImpl().armoredEffect(idGenerator.generateID(), "Hinata", 4, 2, 4));
        this.shinobiDeck.add(new CardFactoyImpl().noEffect(idGenerator.generateID(), "Nagato", 1, 5, 4));
        
        this.shinobiDeck.add(new CardFactoyImpl().growthEffect(idGenerator.generateID(), "Kakashi", 4, 2, 6, "Kakashi [Anbu]", 6, 6, Optional.of(new Armored())));
        this.shinobiDeck.add(new CardFactoyImpl().growthEffect(idGenerator.generateID(), "Itachi", 4, 2, 6, "Itachi [Susanoo]", 1, 7, Optional.empty()));
        
        // Card-Bosses
        this.shinobiDeck.add(new CardFactoyImpl().growthEffect(idGenerator.generateID(), "Boruto Uzumaki", 5, 5, 8, "Momoshiki Otsutsuki", 8, 1, Optional.of(new Poison())));
        this.shinobiDeck.add(new CardFactoyImpl().armoredEffect(idGenerator.generateID(), "Kaguya Otsutsuki", 10, 7, 10));
        this.shinobiDeck.add(new CardFactoyImpl().growthEffect(idGenerator.generateID(), "Naruto Uzumaki", 4, 4, 7, "Naruto [Mod. Eremita]", 6, 6, 
                             Optional.of(new Growth("Naruto [Six-Path]", 8, 8, 
                             Optional.of(new Growth("Naruto [Mod. Bayron]", 10, 10, Optional.empty()))))));
        
        
        return this.shinobiDeck;
    }

}
