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
				<form action="Form_5" method="post">
                  <table id="firm_table" class="table table-striped table-bordered table-hover">
       
       
                                    <h4 class="text-center"><strong>Values</strong></h4>
                                    
                                    <tbody>
              
                <tr>
                <td><strong>Maximum Marks</strong></td>
                <td><strong>15</strong></td>
               
              </tr>
              </tbody>
              </table>
          
          
               <table id="firm_table" class="table table-striped table-bordered table-hover">
       
                               <thead>
              <tr>
                <th>S.No</th>
                <th>Core Values</th>
                <th>Ratings (1-2-3-4-5)</th>
              
                
              </tr>
            </thead>

            <tbody>
              
                <tr>
                <td><strong>1</strong></td>
              
                <td><strong>Fairness Transparency -</strong> Decions are made obejectively, free from patronge and reflect the just treatment of employee and applications. There is open commmunication about every aspect of managegerial decisions which concern people.</td>
                <td><input type="text" class="form-control" name="fairness_transparency"></td>
              </tr>
              
                <tr>
                <td><strong>2</strong></td>
              
                <td><strong>Ethical Behaviour -</strong> Demonstrate honesty and sincerity in every action *Apply sound business and professional ethics* show consistency with principles,values and behaviours.</td>
                <td><input type="text" class="form-control" name="ethical_behaviour"></td>
              </tr>
              
                <tr>
                <td><strong>3</strong></td>
              
                <td><strong>Discipline -</strong> Adherence to accepted norms *Honours the promises,and adhere to agreed system* respect for others time and space* Exercise self control.</td>
                <td><input type="text" class="form-control" name="discipline"></td>
              </tr>
                <tr>
                <td><strong>4</strong></td>
           
                <td><strong>Trust -</strong>Trustworthiness leading to confidence *allow staff the freedom to grow and develop*Relate to others on the basis of mutual respect* courage to stand by your convictions.</td>
                <td><input type="text" class="form-control" name="trust"></td>
              </tr>
              <tr>
                <td><strong>5</strong></td>
           
                <td><strong>Involvement and Collaboration -</strong>Total commitment *Be dedicated and committed to work *Build commitment by encouraging participation in decision making process to the maximum extent possible.Workin tandem *be open in sharing informationand in seeking suggestion/openion 8Be sensitive to concerns of others honour your commitment* encourage team workacross departments/function.</td>
                <td><input type="text" class="form-control" name="involvement_collaboration"></td>
              </tr>
                <tr>
                <td></td>
              
                <td><strong>Total</strong></td>
                <td><input type="text" class="form-control" name="total_ratings"></td>
              </tr>
              
            
             
            </tbody>
          </table>

    
          
          <div class="col-md-4" style="margin-bottom:20px;">Rating on competencies<br> (Pro-rated to total Marks of 10)</div>
                    <div class="col-md-4 text-center">
                    <label style="text-decoration:underline; text-align:center;"> Total of all ratings * 3 =</label>
                    <div class="clearfix"></div>
                   	 5
                    </div>
                    <div class="col-md-4"><input type="text" class="form-control" name="overall_marks"></div>

        

          
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