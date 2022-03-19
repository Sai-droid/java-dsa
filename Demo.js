var numbers1=new Array(10,20,60,20);
var numbers2=new Array(10);
var numbers3=Array.of(100);

console.log(" size of array numbers1 "+numbers1.length);//4
console.log(" size of array numbers2 "+numbers2.length);//10
console.log(" size of array numbers3 "+numbers3.length);//10
console.log(numbers3[0]);//100

///---------------------
var nums=[40,180,20,10,200,300,145,125];
var result= Array.from(nums,(num)=>{ return (num+100)});
console.log(" Prosessewd array : "+result);
//------------------------
var result2=nums.find(function(value,index,array)
{
            if(value>=100)
            {
                return true;
            }
});
console.log(" Prosessewd array 2: "+result2);

//--------------------------------
var result3=nums.filter((num)=>{return num>100});
console.log(" Prosessewd array 3: "+result3);





 


var employee={
    age:3,
    getfunction: ()=> 
    employee.age
}



const agee = employee.getfunction;
console.log(agee());


ar Employee={
    age:42,v
    getAge:function()
    {
        return this.age
        //return 10;
    }
  }
  var user=
  {
      firstName:"Vaishali",
      sayHi: function()
      {
              console.log( "Welcome :"+ this.firstName);
      }
  }
  
  //----------------------------
  //console.log(" Age : "+Employee.age)//42
  //console.log("  Age Using getAge() : "+Employee.getAge());//42
  console.log("  Age Using getAge() : "+Employee.getAge);//return function  ref
  const showMyAge=Employee.getAge;
  console.log("  Type of showMyAge() : "+typeof(showMyAge));
  console.log("  Age Using showMyAge() : "+showMyAge());
  //...........................
  var   boundedAge=showMyAge.bind(Employee)
  console.log("  Type of boundedAge() : "+typeof(boundedAge));
  console.log("  Age Using boundedAge() : "+boundedAge());
  
  //----------------------------
  
  
  setTimeout((user.sayHi).bind(user),3000);
  
  
  
  
  
  import Recat,{useState,useEffect} from "react"

function HookCounter(props)
{
    const [count,setCount]=useState(0);
    const [name,setName]=useState({firstName:"",lastName:""});
    const [items,setItems]=useState([]);

    console.log(" HookCounter start here...");
    function decreaseCount()
    {
        console.log("Inside decresecount");
        setCount(count-1);
    }

    //-----------------------
   function addRandomNum()
    {
        console.log("Inside random num");
        setItems([...items,
            {id:items.length,value:Math.random()*10}
             ]);
    }
    return (<div>

                <h2>This is hook demo</h2>
                <button  onClick={()=>{setCount(count+1)}}>
                IncreaseCount</button>
                Count - {count}
                <button onClick={decreaseCount} >DecreaseCount</button>
            <br/>
            FirstName:<input type="text" 
            value={name.firstName}  
             onChange={(event)=>{
                 setName({...name,firstName:event.target.value})
             }}/><br/>
            LastName :<input type="text"                         
            value={name.lastName}
            onChange={(event)=>{
                setName({...name,lastName:event.target.value})
            }}
            /><br/>
            <hr/>
            FirstName:{name.firstName}- LastName:{name.lastName}
            <hr/>
            <button onClick={addRandomNum}> Add Random Number</button>
            <b> 
                {
                    items.map((numobj,index)=>{
                        return <li key={index}>ID : {numobj.id} - VALUE: {numobj.value}</li>
                    })
                }
                
           </b>  

    </div>);
    console.log(" HookCounter ends here...");

}


export default HookCounter;

-state==  data which drives our application.
-------------------------------------------
-view== a declarive description of The UI.
----------------------------------------------
-action=the event that occurs in the application based 
on the user input. and it will trigger the update and it will update statye.
-----------------------------------------------------------
-So action in redux is the plain java script object
which has type and  and payload field.
------------------------------------------------
-action creattor is a function which creates and return the action object.return {type:"",payload:""}
-------------------------------------------------------
-Reducer -reducer is function which.
receives a a current state and the action object
object and decides how top update the state .
and if necessary return the  new state.
--------------------------------------------------
-store- the current application stae is present in the object called store.
and it is created by createStore() function.
-------------------------------------------------------------
-Dispatch-  Reduxt store has method called dispatch .
when ever we want to update the state call  store.dispatch(). and
 pass the action object to it.
 -----------------------------------------------------------

-So dispatching action is like triggering an event" in the application.
it's like something happed and we want the store to know about it.
--------------------------------------------------------
-Thunk-
Redux Thunk is a middleware that lets you 
call action creators that return a function instead
 of an action object.  That function receives the store's dispatch method,
  which is then used to dispatch regular synchronous actions 
  inside the function's body once the asynchronous operations
   have been completed.

   Redux Thunk is middleware that allows you to return functions,
    rather than just actions, within Redux. This allows for delayed 
    actions, including working with promises. One of the main use cases 
    for this middleware is for handling actions that might not be synchronous, 
    for example, using axios to send a GET request
    -----------------------------------------------------




const redux=require("redux");
const reduxLogger  =require("redux-logger");
const thunkMiddleware=require("redux-thunk").default;
const axios=require("axios");
const createStore=redux.createStore;
const combineReducer=redux.combineReducers;
const applyMiddleware=redux.applyMiddleware;
const logger=reduxLogger.createLogger();

//------------initial----------
const initialState={
    loading:false,
    emps:[],
    errors:""
}
//------------action name----------
const FETCH_EMP_REQUEST="FETCH_EMP_REQUEST";
const FETCH_EMP_SUCCESS="FETCH_EMP_SUCCESS";
const FETCH_EMP_FAILURE="FETCH_EMP_FAILURE";
//--------------------action creatioe--------
const fetchEmpRequest=()=>{
 
    return {type:FETCH_EMP_REQUEST,
        payload:" Loading ................"}
}

const fetchEmpSuccess=(myEmpsArr)=>{

    return {type:FETCH_EMP_SUCCESS,
        payload:myEmpsArr}
}
const fetchEmpFailure=(empError)=>{

    return {type:FETCH_EMP_FAILURE,
        payload:empError}
}
//-----------reducer------------------
function empReducer(state=initialState,action)
{
    switch(action.type)
    {
            case FETCH_EMP_REQUEST:
                return {...state,loading:true}
            case FETCH_EMP_SUCCESS:
               return {...state,emps:action.payload}
            case FETCH_EMP_FAILURE:
               return {...state,error:action.payload}
            default:
                return state;
    }
}
//-------------------
function  fetchEmp()
{
    return function (dispatch)
    {
        dispatch(fetchEmpRequest());
        axios.get("http://localhost:3000/emps").
        then((empRes)=>{
            dispatch(fetchEmpSuccess(empRes.data))
        })
        .catch((empErrRes)=>{
            dispatch(fetchEmpFailure("Error while fetching emp"));
        })
    }

}

//-------------------create store------
const store=createStore(empReducer,applyMiddleware(logger,thunkMiddleware));
//---------------dispatch action-------------
store.dispatch(fetchEmp());

