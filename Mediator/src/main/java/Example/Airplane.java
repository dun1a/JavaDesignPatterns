package Example;

// a concrete aircraft type
// extends the abstract Aircraft class, which defines common properties and behaviors for all aircraft types
public class Airplane extends Aircraft {

    public Airplane(Intention intention, ATC tower) {
        super(intention, tower);
    }
}
