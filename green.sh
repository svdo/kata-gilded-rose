#!/bin/bash

scriptDir="`dirname $0`"
absScriptDir="`cd \"$scriptDir\"; pwd`"
cd ${absScriptDir}
git commit -a -m "All green"
