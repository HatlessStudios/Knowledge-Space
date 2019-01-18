package knowledge;


/**
 * A collection of Atoms. Used for linking pieces of information together.
 */
public interface Molecule {

    Atom[] getAtoms();

    void add(Atom atom);

    void remove(Atom atom);

}
