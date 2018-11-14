# RxJavaGlitch
Minimal Example Application that demonstrates the non-synchronous propagation of Rx using RxJava

## Building and Running
The included build scribt is for SBT.
You can obtain SBT here: https://www.scala-sbt.org

The application is interactive in that you are prompted for number inputs.
Running the application in SBT's interactive mode doesn't work well because output is buffered line-wise, and input is not echoed.
I recommend to package and execute the application natively:

```
$> sbt stage
$> ./target/universal/stage/bin/rxscalaglitch
```

The second line might need backwards instead of forward slashes under Windows, but other than that this should work on any Unix or Windows system.

### Other Build Tools

I'm open for adding build scripts for other build tools. If you write your own, send it to me and I will add it!
All that a build script needs to do is compile the one Java source file while including an RxJava dependency.
A guide for including this dependency in most common build tools can be found here: https://github.com/ReactiveX/RxJava/wiki/Getting-Started

## Using the Application

Enter an integer number (e.g. 123) and press Enter to get the application to react and output results. The first number will initialize the application, and it will output the input value multiplied by 2. For every consequtive input number, this output will be recomputed anew, but produce a spurious intermediate output, i.e., print two output numbers where only the second is correct (the new input value multiplied by 2).

Enter nothing (just press Enter without a number) to exit the application. Or just Ctrl+C.
