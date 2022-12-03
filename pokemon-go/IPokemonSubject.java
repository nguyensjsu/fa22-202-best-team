public interface IPokemonSubject {

    void attach(IPokemonObserver obj);
    void removeObserver(IPokemonObserver obj);
    void notifyObservers();
    
}
