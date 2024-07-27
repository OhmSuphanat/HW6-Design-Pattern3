/**6510450976
 *Suphanat Sroyphet
 */
package org.example;

public class PoliteQuack implements Quackable{
    private Quackable quackable;

    public PoliteQuack(Quackable quackable) {
        this.quackable = quackable;
    }


    @Override
    public void quack() {
        quackable.quack();
        System.out.println("krub");
    }
}
