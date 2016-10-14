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

## License

MIT License

Copyright (c) 2016 Sebastian Hesse

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
