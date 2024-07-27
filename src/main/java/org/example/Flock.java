/**6510450976
 *Suphanat Sroyphet
 */
package org.example;

import java.util.ArrayList;

public class Flock implements Quackable{
    ArrayList<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quackable) {
        quackers.add(quackable);
    }
    @Override
    public void quack() {
        System.out.println("---Flock---");
        int totalQuackers = quackers.size();
        for (int i = 0; i < totalQuackers; i++) {
            if (i == 0) {
                quackers.get(i).quack();
                quackers.get(i).quack();
            }
            quackers.get(i).quack();
        }
    }
}
