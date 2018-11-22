#!/bin/bash

scriptDir="`dirname $0`"
absScriptDir="`cd \"$scriptDir\"; pwd`"
cd ${absScriptDir}
git reset --hard
