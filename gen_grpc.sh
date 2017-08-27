#!/bin/bash

# protobuf version: 3.4.0
# grpc version: 1.4.0

JAVA_RPC_PLUGIN="/home/alex/programs/grpc/grpc-java-1.4.0/compiler/build/exe/java_plugin/protoc-gen-grpc-java"

PROTO_FILE=kibbutz.proto
PROTO_PATH=src/proto

OUT_PATH=src/main/java

protoc -I=${PROTO_PATH} --java_out=${OUT_PATH} ${PROTO_FILE}

protoc --plugin=protoc-gen-grpc-java=${JAVA_RPC_PLUGIN} --grpc-java_out=${OUT_PATH} --proto_path=${PROTO_PATH} ${PROTO_FILE}
