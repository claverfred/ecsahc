//I will be using a library to parse json 

class Answer5 {
    public String json = ...; // url to the directory of the json.
   JsonArray jsonArr = new JsonParser().parse(json).getAsJsonArray();
    for(int i = 0; i < jsonArr.size(); i++) {
    JsonObject jsonObj = jsonArr.get(i).getAsJsonObject();
    String name = jsonObj.get("name").getAsString();
    String uuid = jsonObj.get("uuid").getAsString();
    // Do something with the name and uuid.
} 
}
