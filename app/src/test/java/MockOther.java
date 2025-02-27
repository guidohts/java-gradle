import interfaces.IOther;

class MockOther implements IOther {
    @Override
    public String doSomething() {
        return "Business done!";
    }
}