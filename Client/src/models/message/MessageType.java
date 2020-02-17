package models.message;

public enum MessageType {
    //SENDER:SERVER
    OPPONENT_INFO,
    SEND_EXCEPTION,
    ACCOUNT_COPY,
    GAME_COPY,
    ORIGINAL_CARDS_COPY,
    CARD_POSITION,
    TROOP_UPDATE,
    GAME_UPDATE,
    Game_FINISH,
    DONE,
    ANIMATION,
    INVITATION,
    ADD_TO_ORIGINALS,
    ADD_TO_CUSTOM_CARDS,
    REMOVE_FROM_CUSTOM_CARDS,
    CUSTOM_CARDS_COPY,
    ONLINE_GAMES_COPY,
    //SENDER:CLIENT
    GET_DATA,
    MOVE_TROOP,
    CREATE_DECK,
    REMOVE_DECK,
    ADD_TO_DECK,
    REMOVE_FROM_DECK,
    SELECT_DECK,
    BUY_CARD,
    SELL_CARD,
    INSERT,
    ATTACK,
    USE_SPECIAL_POWER,
    END_TURN,
    LOG_IN,
    LOG_OUT,
    REGISTER,
    MULTIPLAYER_GAME_REQUEST,
    CANCEL_REQUEST,
    NEW_DECK_GAME,
    SELECT_USER,
    SUDO,
    IMPORT_DECK,
    FORCE_FINISH,
    ACCEPT_CARD,
    REJECT_CARD,
    CHANGE_ACCOUNT_TYPE,
    ADD_CARD,
    ONLINE_GAME_SHOW_REQUEST,
    STOP_SHOW_GAME,
    SET_NEW_NEXT_CARD,
    //SENDER:DUAL
    CHAT,
    ACCEPT_REQUEST,
    DECLINE_REQUEST,
    CHANGE_CARD_NUMBER,
    REPLACE_CARD;
}