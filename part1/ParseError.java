public class ParseError extends Exception {
    String function;
    StackTraceElement[] elements = Thread.currentThread().getStackTrace();

    public ParseError(String funct) {
        this.function = funct;
    }

    public String getMessage() {
        return "parse error in "+function;
    }

    public void printStackTrace() {
        for (int i = 1; i < elements.length; i++)
        {
            StackTraceElement s = elements[i];
            System.out.println("\tat " + s.getClassName() + "." + s.getMethodName()
                    + "(" + s.getFileName() + ":" + s.getLineNumber() + ")");
        }
    }
}