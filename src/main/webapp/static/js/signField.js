$(function(){
	
	$.fn.extend({
		getSignField:function(obj,i){
			var i = i;
			console.log(i)
			var html = "";
		   
			        
				        html+='<label class="checkbox col-sm-3">';
				        html+='<input type="checkbox" value=""/>'+obj.name;
				        html+='</label>';
				        html+='<label class="radio col-sm-3">';
				        html+='<input type="radio" name="radioCheck'+i+'" value=""/>'+obj.name;
				        html+='</label>';
				        html+='<label class="radio col-sm-3">';
				        html+='<input type="radio" name="radioCheck'+i+'"  value=""/>'+obj.name;
				        html+='</label>';
			        
			return html;
		    
		}
	})
	
})
