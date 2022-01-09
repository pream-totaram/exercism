#!/bin/zsh

docker run --rm -w /go/src/app/vehicle-purchase -v $(PWD):/go/src/app/vehicle-purchase exercism_go go test -v --bench . --benchmem
