/**6510450976
 *Suphanat Sroyphet
 */
package org.example;

public class QuackCounter implements Quackable{
    Quackable quackable;

    private static int numOfQuack = 0;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        numOfQuack++;
    }

    public static int getNumOfQuack() {
        return numOfQuack;
    }

}
