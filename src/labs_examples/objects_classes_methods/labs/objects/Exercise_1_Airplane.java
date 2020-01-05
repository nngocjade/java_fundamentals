package labs_examples.objects_classes_methods.labs.objects;

/**
 * Following the example in CarExample.java, please use Object Composition to model an Airplane class.
 * The Airplane class must be composed of at least 4 other classes (as well as any primitive types you'd like).
 * The Airplane class itself should have a fuel capacity (double) variable, as well as a currentFuelLevel variable.
 * We'll use these a bit later.
 */


class Exercise_1_Airplane {

    Make make;

    Model model;

    Capacity capacity;

    AEngine aEngine;

    public void Airplane(Make make, Model model, Capacity capacity, AEngine aEngine) {

        this.make = make;

        this.capacity = capacity;

        this.model = model;

        this.aEngine = aEngine;
    }

        @Override
        public String toString() {
            return "Airplane{" +
                    "engine=" + make.toString() +
                    ",\n capacity=" + capacity.toString() +
                    ",\n model='" + model.toString() +
                    ",\n aEngine='" + aEngine.toString() +
                    '}';
        }

}

class Make {

}

class Model {

}

class Capacity {



}

class AEngine {

}

