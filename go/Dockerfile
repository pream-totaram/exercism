FROM golang:bullseye

WORKDIR /go/src/app
COPY . .

RUN go mod init
RUN go install -v golang.org/x/tools/cmd/godoc@latest

