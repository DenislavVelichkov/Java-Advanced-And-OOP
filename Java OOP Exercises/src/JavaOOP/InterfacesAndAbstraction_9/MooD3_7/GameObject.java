package JavaOOP.InterfacesAndAbstraction_9.MooD3_7;

public interface GameObject<T> {
    String getUsername();
    String getCharacterType();
    Number getSpecialPoints();
    int getLevel();
    T getHashedPassword();
    void setHashedPassword(T password);
}
