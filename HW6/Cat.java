class Cat extends Animal {
        Cat(String name, float run, float swim) {
                super("Cat", name, run, swim);
        }

        @Override
        protected int swim(float distance) {
                return SWIM_FAIL;
        }
}