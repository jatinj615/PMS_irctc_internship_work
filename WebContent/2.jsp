<!DOCTYPE html>
<html lang="en">
<head>

  <meta charset="utf-8">
  <meta http-equiv="Content-Type" content="text/plain; charset=UTF-8"/>
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>irctc</title>
  <link href="css/bootstrap.min.css" rel="stylesheet"></link>
  <link rel="stylesheet" href="css/style.css">

  <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
  <![endif]-->

</head>
<body>

  <div class="container home">

    <div class="row">
  	<div class="table-responsive">
    	<form action="Form_2" method="post">
          <table id="firm_table" class="table table-striped table-bordered table-hover">
               <h4 class="text-center"><strong>Year End Performance Review</strong></h4>

            <thead>
              <tr>
                <th>S.No</th>
                <th>Key Result Areas</th>
                <th>Target</th>
                <th>Maximum Marks</th>
                
                <th>Actual Achievement <br> (given by appraise)</th>
                <th>Review by Appraiser</th>
                <th>Marks Awarded (by Appraiser)</th>
                
              </tr>
            </thead>
            <tbody>
              <tr>
                <td>1</td>
                <td><textarea class="form-control" rows="1" id="comment"></textarea></td>
                <td><input type="text" class="form-control" id="usr"></td>
                 <td><input type="text" class="form-control" id="usr"></td>
                 <td><input type="text" class="form-control" id="usr"></td>
                 <td><input type="text" class="form-control" id="usr"></td>
                 <td><input type="text" class="form-control" id="usr"></td>
              </tr>
               <tr>
                <td>2</td>
                <td><textarea class="form-control" rows="1" id="comment"></textarea></td>
                <td><input type="text" class="form-control" id="usr"></td>
                 <td><input type="text" class="form-control" id="usr"></td>
                 <td><input type="text" class="form-control" id="usr"></td>
                 <td><input type="text" class="form-control" id="usr"></td>
                 <td><input type="text" class="form-control" id="usr"></td>
              </tr>
               <tr>
                <td>3</td>
                <td><textarea class="form-control" rows="1" id="comment"></textarea></td>
                <td><input type="text" class="form-control" id="usr"></td>
                 <td><input type="text" class="form-control" id="usr"></td>
                 <td><input type="text" class="form-control" id="usr"></td>
                 <td><input type="text" class="form-control" id="usr"></td>
                 <td><input type="text" class="form-control" id="usr"></td>
              </tr>
               <tr>
                <td>4</td>
                <td><textarea class="form-control" rows="1" id="comment"></textarea></td>
                <td><input type="text" class="form-control" id="usr"></td>
                 <td><input type="text" class="form-control" id="usr"></td>
                 <td><input type="text" class="form-control" id="usr"></td>
                 <td><input type="text" class="form-control" id="usr"></td>
                 <td><input type="text" class="form-control" id="usr"></td>
              </tr>
               <tr>
                <td>5</td>
                <td><textarea class="form-control" rows="1" id="comment"></textarea></td>
                <td><input type="text" class="form-control" id="usr"></td>
                 <td><input type="text" class="form-control" id="usr"></td>
                 <td><input type="text" class="form-control" id="usr"></td>
                 <td><input type="text" class="form-control" id="usr"></td>
                 <td><input type="text" class="form-control" id="usr"></td>
              </tr>
              <tr>
                <td>6</td>
                <td><textarea class="form-control" rows="1" id="comment"></textarea></td>
                <td><input type="text" class="form-control" id="usr"></td>
                 <td><input type="text" class="form-control" id="usr"></td>
                 <td><input type="text" class="form-control" id="usr"></td>
                 <td><input type="text" class="form-control" id="usr"></td>
                 <td><input type="text" class="form-control" id="usr"></td>
              </tr>
              <tr>
                <td>7</td>
                <td><textarea class="form-control" rows="1" id="comment"></textarea></td>
                <td><input type="text" class="form-control" id="usr"></td>
                 <td><input type="text" class="form-control" id="usr"></td>
                 <td><input type="text" class="form-control" id="usr"></td>
                 <td><input type="text" class="form-control" id="usr"></td>
                 <td><input type="text" class="form-control" id="usr"></td>
              </tr>
              <tr>
                <td>8</td>
                <td><textarea class="form-control" rows="1" id="comment"></textarea></td>
                <td><input type="text" class="form-control" id="usr"></td>
                 <td><input type="text" class="form-control" id="usr"></td>
                 <td><input type="text" class="form-control" id="usr"></td>
                 <td><input type="text" class="form-control" id="usr"></td>
                 <td><input type="text" class="form-control" id="usr"></td>
              </tr>
               <tr>
                
                <td colspan="3"><strong>Total</strong></td>
                <td><strong>100</strong></td>
                 <td></td>
                 <td></td>
                 <td>
                 	<input type="text" class="form-control" id="usr">
                 </td>
              </tr>
            
            </tbody>
          </table>
          <div class="col-md-4">Total performance marks for the year <br> (Pro-rated to total Marks of 50)</div>
                    <div class="col-md-4 text-center">
                    <label style="text-decoration:underline; text-align:center;"> Total Marks Obtained * 50 =</label>
                    <div class="clearfix"></div>
                    100
                    </div>

          <div class="col-md-4 pull-right"><input type="text" class="form-control" id="usr"></div>
          <div class="col-md-12" style="margin-bottom:20px; margin-top:20px;">
          <label>Reasons for shortfall in target, if any.</label>
          <textarea class="form-control" rows="3" id="comment"></textarea>
          </div>

          
           <table id="firm_table" class="table table-striped table-bordered table-hover">
           
            <tbody>
              <tr>
                <td>Xyz</td>
                <td>Abc</td>
              </tr>
                <tr>
                <td><strong>Signature of Appraiser</strong></td>
                <td><strong>Signature of Appraiser</strong></td>
              </tr>
              <tr>
                <td><strong>Date: 22/03/2017</strong></td>
                <td><strong>Date: 22/03/2017</strong></td>
              </tr>
            </tbody>
          </table>
                  <button type="submit" class="btn btn-primary btn-lg pull-right" >Next</button>
			</form>
        </div>

    </div>

  </div>

  <script src="js/jquery.min.js"></script>
  <script src="js/bootstrap.js"></script>
  <script src="js/main.js"></script>

</body>
</html>