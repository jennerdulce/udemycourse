# WRRC - Web Request Response Cycle

## General

### HTTP Protocol

- Hypertext Transfer Protocol
- Application layer protocol
- Allows web-based applications to communicate and exchange data
- Http is the "messenger" of the web to deliever contents
- Client - Computer that makes the request
- Server - Serves and responds to the request

1. HTTP is connectionless
   - After making the request, client disconnects from server. And re-establishes connection with response is ready to deliever
2. Can deliever any sort of data as long as both computers are able to read it
3. HTTP is STATELESS
   - Client and server know about each other only DURING the request
   - New connects are made per each request

### Request Response Cycle

- General internet provides environment for the RRC to happen
- After connection established, client sends a REQUEST HTTP message
- Server processes request and prepares response, then creates RESPONSE HTTP message

### Parts of HTTP message

1. URI / URL
2. HTTP Method
3. Header
4. Body (optional)