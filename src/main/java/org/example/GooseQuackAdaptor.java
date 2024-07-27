/**6510450976
 *Suphanat Sroyphet
 */
package org.example;

public class GooseQuackAdaptor implements Quackable{
    private Goose goose;

    public GooseQuackAdaptor(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.hook();
    }
}
