#!/usr/bin/bash

# create class, description and its test with given name
#bash setup [Easy/Hard/Medium] [className]

if [ -z "$1" ] || [ -z "$2" ]; then
    exit 1;
elif [ "$1" != "Easy" ] && [ "$1" != "Medium" ] && [ "$1" != "Hard" ]; then
    echo "wrong argument is found. Enter: Easy / Medium / Hard."
    exit 1;
fi

# preset
presetClass="package Solutions."$1"."$2";

public class "$2" {

}
"
presetTest="package UnitTests."$1";

public class "$2"Test {

}
"

# path
workingDir="$(pwd)"
classPath="src/main/java/Solutions/"$1
testPath="src/test/java/UnitTests/"$1
# ----------------------------------------------------------

# create description and java class
cd "${classPath}" || exit
mkdir "$2"
cd "$2" || exit
touch Description

echo "${presetClass}" > $"$2".java
cd || exit
cd "${workingDir}" || exit

# create unit test class
cd "${testPath}" || exit

echo "${presetTest}" > $"$2"Test.java