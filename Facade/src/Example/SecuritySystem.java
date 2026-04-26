package Example;

// interface
// includes security related operations like activate, deactivate
// additional functionality like readLog, which allows direct access to security logs

public interface SecuritySystem {

    void activate();
    void deactivate();
    void readLog();
}
