package Example;

// is the abstract product in the factory method pattern,
// it defines the interface for the objects
// that will be created by the factory method (createRoom()) in the Game class.
// Any concrete product (like LovelyRoom or ScaryRoom) must implement this interface and provide its own implementation of the enter() method.
public interface Room {

    void enter();
}
