Engineering Minor selection ChatBot
chatbot using nltk python library CHATBOT FOR SELECTION OF ENGINEERING MINORS.
Chatbots are typically used in dialog systems for variopractical purposes including customer service or information acquisition. Some chatterbots use sophisticated NLP systems, but many simpler systems scan for keywords within the input, then pull a reply with the most matching keywords, or the most similar wording pattern, from a database.

we will learn to create a simple chat assistant or chatbot using Python’s NLTK library. NLTK has a module, nltk.chat, which simplifies building these engines by providing a generic framework. Modules of code:- Chat: This is a class that has all the logic that is used by the chatbot. Reflections: This is a dictionary that contains a set of input values and its corresponding output values. It is an optional dictionary that you can use. You can also create your own dictionary in the same format as below and use it in your code.

reflections = { "i am" : "you are", "i was" : "you were", "i" : "you", "i'm" : "you are", "i'd" : "you would", "i've" : "you have", "i'll" : "you will", "my" : "your", "you are" : "I am", "you were" : "I was", "you've" : "I have", "you'll" : "I will", "your" : "my", "yours" : "mine", "you" : "me", "me" : "you" }

You can also create your own reflections dictionary in the same format as above and use it in your code.

and use it as :

chat=Chat(pairs,my_dummy_reflections)

Source Code :

pairs

The code is quite simple, still lets understand it :-

->> Once the function chatty() is invoked , a default message will be displayed :

def chatty(): print("Hi, I'm Chatty and I chat alot ;)\nPlease type lowercase English language to start a conversation. Type Bye to leave ")

->> Next step is to trigger the conversation :

chat.converse()

->> we have just hardcoded the probable question and answers in the list pairs.: from nltk.chat.util import Chat,reflections
pairs=[
    ['my name is (.*)',['hi! %1']],
    ['(hi|holla|heya|hey|hello)',['hey there!how may i help you?']],
    ['(.*)in(.*)is fun',['%1 in %2 is indeed fun ']],
    ['(.*) procedure',['I feel glad to inform you!!!In your 4th semester we are do polling in it you have to participate.']],
    ['(.*) courses',['Well!!Good question. We have five engineering minors courses available in our collage.']],
    ['(.*) name of the courses',['Courses like-1.Web-Development,2.Data-Science,3.Cyber-Security,4.Machine-Learning,5.Software-Testing']],
    ['(.*) ranking',['yaa! Every courses have its own values.But now a days Data-Science have high demand in companies.']],
    ['(.*) prerequisite',['Well! you should know basic of engineering courses which you studied in till 2nd year like DBMS,DATA STRUCTURE and many more']],
    ['(.*) polling schedule',[' you will know it via ums or lpu touch.anything else i can help with?']],
    ['ok',['yups, anything else?']],
    ['yes',['may i know?']],
    ['sure',['go on..']],
    ['(.*) path',['sure! ums- login >home>ums navigation>LMS>Engineering Minor Polling']],
    ['(.*) (do not|did not)',[' score well in rest of examinations and specially in ca,also manage proper attendance.']],
    ['(.*) backlog',['factors:more than ten percent in mte,more than twenty percent in ete,more then fourty percent overall/subject,umc back']],
    ['(.*) umc back',['in case you were found disrespecting laws/ rules & regulation of university you are bearer of umc that undefines your  scholarship as well as if serious  you maybe  backed']],
    ['(.*) come to know our result of polling',['you will recieve lpu touch notification regarding that.']],
    ['(.*) placement',[' regarding placement you can visit to -respective authorities they will inform you although till your second year you will familiar of these.']],
    ['no',['thank you,had a great conversation.have a good day ahead!']],
    ['(.*) thank you',['thank you,had a great conversation.have a good day ahead!']],]

The nltk.chat chatbots work on the regex of keywords present in your question. So you can add any number of questions in a proper format so that your chatbot doesn’t get confused in determining the regex.
