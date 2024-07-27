/**6510450976
 *Suphanat Sroyphet
 */
package org.example;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new DuckFactory();
        AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();
        AbstractDuckFactory politeDuckFactory = new CountingPoliteDuckFactory();

        simulator.simulate(duckFactory);
        simulator.simulate(countingDuckFactory);
        simulator.simulate(politeDuckFactory);
    }

    void  simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable readheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();

        Quackable goose = new GooseQuackAdaptor(new Goose());
        Quackable pigeon = new PigeonQuackAdaptor(new Pigeon());

        Flock flock1 = new Flock();
        flock1.add(mallardDuck);
        flock1.add(readheadDuck);

        Flock flock2 = new Flock();
        flock2.add(duckCall);
        flock2.add(rubberDuck);
        flock2.add(goose);

        System.out.println("\nDuck Simulator");


        simulate(flock1);
        simulate(flock2);

        System.out.println("Number of Quacks = " + QuackCounter.getNumOfQuack());
    }

    void simulate(Quackable duck) {
        duck.quack();
    }


}
