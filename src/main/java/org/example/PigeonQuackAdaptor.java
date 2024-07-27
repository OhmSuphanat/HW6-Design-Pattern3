/**6510450976
 *Suphanat Sroyphet
 */
package org.example;

public class PigeonQuackAdaptor implements Quackable{
    private Pigeon pigeon;
    public PigeonQuackAdaptor(Pigeon pigeon) {
        this.pigeon = pigeon;
    }

    @Override
    public void quack() {
        pigeon.coo();
        pigeon.coo();
    }
}
