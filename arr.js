// var rotate = function(nums, k) {
//     let newArr = [...nums];
//     nums = []
//     for(let i = newArr.length - k; i < newArr.length; i++){
//         nums.push(newArr[i])
//     }
//     for(let i = 0; i < newArr.length - k; i++){
//         nums.push(newArr[i])
//     } 
//     console.log(nums);
// };
var rotate = function(nums, k) {
    let newArr = [...nums];
    nums = []
    let newAr=[]
    for(let i = newArr.length - k; i < newArr.length; i++){
        newAr.push(newArr[i])
    }
    for(let i = 0; i < newArr.length-k; i++){
         newAr.push(newArr[i])
    } 
    nums=[...newAr]
    console.log(nums);
};
let nums =[1,2,3,4,5,6,7];
rotate(nums,3);

//-------------callback---------------
var greetMe=function(name)
{
    return ("  Happy new Yera : "+name);
}
//--------------------------------
var wishMe=function(greet,year)
{
    console.log(" Type Of greet : "+ typeof(greet));
    console.log(greet ("vaishali")  + " - "+year);

}
//------------------------
wishMe(greetMe,2022);
//-----------------------------X---------------
var count=0;
/*function add()
{
    return ++count;
}*/

//----------------------
/*function add()
{
     function plus()
     {
            ++count;
     }
     plus();
     return count;

}*/

function add()
{
     function plus()
    {
         return   ++count;
    }
 return plus;
 }
//-------------------
var pl=add();
console.log(" Type of pl : "+ typeof(pl));
console.log(" Count = "+pl());



//-------------callback---------------
var greetMe=function(name)
{
    return ("  Happy new Yera : "+name);
}
//--------------------------------
var wishMe=function(greet,year)
{
    console.log(" Type Of greet : "+ typeof(greet));
    console.log(greet ("vaishali")  + " - "+year);

}
//------------------------
wishMe(greetMe,2022);
//-----------------------------X---------------
var count=0;
/*function add()
{
    return ++count;
}*/

//----------------------
/*function add()
{
     function plus()
     {
            ++count;
     }
     plus();
     return count;

}*/

function add()
{
     function plus()
    {
         return   ++count;
    }
 return plus;
 }
//-------------------
var pl=add();
console.log(" Type of pl : "+ typeof(pl));
console.log(" Count = "+pl());
//--------------------------
var add1=( function()
{
        return  function()
        {
                console.log("....."+ ++count);
        }
  }
)();
var pl1=add1();
console.log(" Type of pl1 : "+ typeof(pl1));
//console.log(" Count = "+pl1());
//console.log(" ----------------------------");

var showCount=
function()
{
     var  count=5;
     console.log(" in side .....")
     return function ()
     {
            count=count+1;
            console.log("------"+ count);
            return count;
     }
}

//console.log("..type of shocouuint..."+typeof(showCount));//function
//console.log("..type of shocouuint..."+typeof(showCount()));//number
//console.log("....."+showCount());

//----------------------------
var inner=
(
   function(a)
   {
       console.log("in outer function a ="+a)
        var innerFunction=function(b)
        {
            let sum=0;
            console.log("in inner  function b ="+b)
            sum= a+b;
            console.log(" sum = "+sum);
            return sum;

        }
        return innerFunction;
   } 
)//(30);
//--------
var inn=inner(20);
console.log(" type of in :"+ typeof(inn));
console.log("...."+inn(30));






















