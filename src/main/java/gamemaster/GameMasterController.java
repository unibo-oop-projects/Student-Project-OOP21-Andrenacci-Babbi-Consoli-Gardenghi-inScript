package gamemaster;

import java.util.Optional;
import cards.Card;
import shared.Player;

public interface GameMasterController {
    
    String GameOverWinMessage="Hai vinto";
    String GameOverLoseMessage="Hai Perso";
    String GameOverTieMessage="Pareggio - non ci sono piu carte da pescare";
    
    String DrawPhaseAIMessage = "Fase di pescata del nemico";
    String DrawPhaseMessage = "Fase di pescata del giocatore";
    String MainPhaseAIMessage = "Fase di posizionamento del nemico";
    String MainPhaseMessage = "Fase di posizionamento del giocatore";
    String BattlePhaseAIMessage = "Fase di battaglia del nemico";
    String BattlePhaseMessage ="Fase di battaglia del giocatore";
    
    Optional<Card> getCardToShow();
    Optional<Card> getCardToPlace();
    
    Player getHumanPlayer();
    Player getIAPlayer();
    
    //////////////////////////////////////

    
    void onSelectCardToShow(Card card);
    
    void onSelectCardToPlace(Card card);
    
    void onCardPlacing(int indexOfTheCellInTheBoard);
    
    void onEndTurn();
}
