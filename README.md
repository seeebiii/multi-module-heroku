# multi-module-heroku
Example project to show how to deploy sub modules to multiple heroku apps.

## Author
Sebastian Hesse

## How-To
1. Fork this repository.
2. Connect your Heroku-Account to your GitHub-Account.
3. Create a new app and choose under *Deploy* the forked repository.
4. Add the following **Config Variable** under *Settings*: PATH_TO_JAR = ChildOne/target/child-one-1.0-SNAPSHOT.jar
5. Deploy the app and try to access the HelloWorldResource: http://your-app-name.heroku.com/hello
