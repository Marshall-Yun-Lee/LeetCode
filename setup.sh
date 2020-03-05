#!/usr/bin/bash

# create class, description and its test with given name
# bash setup [Easy/Hard/Medium] [className]

if [ -z "$1" ] || [ -z "$2" ]; then
    exit 1;
elif [ "$1" != "Easy" ] && [ "$1" != "Medium" ] && [ "$1" != "Hard" ]; then
    echo "wrong argument is found. Enter: Easy / Medium / Hard."
    exit 1;
fi

nameNoSpace="$(echo -e "$2" | tr -d '[:space:]')"

# preset
presetClass="package Solutions."$1"."${nameNoSpace}";

public class "${nameNoSpace}" {

}
"
presetTest="package UnitTests."$1";

public class "${nameNoSpace}"Test {

}
"

# path
workingDir="$(pwd)"
classPath="src/main/java/Solutions/"$1
testPath="src/test/java/UnitTests/"$1
# ----------------------------------------------------------
# create description and java class
cd "${classPath}" || exit
mkdir "${nameNoSpace}"
cd "${nameNoSpace}" || exit
touch Description

echo "${presetClass}" > $"${nameNoSpace}".java

# back to working directory
cd || exit
cd "${workingDir}" || exit

# auto-load description from the Web
python3 pullDescription.py -n "$2" -p "${classPath}/${nameNoSpace}/Description"

# create unit test class
cd "${testPath}" || exit

echo "${presetTest}" > $"${nameNoSpace}"Test.java


