# Kadane's Algorithm
<br>
<h3>Pseudo code:</h3>
<p>
Initialize:<br>
<ul>
    <li>max_so_far = 0<br>
    <li>max_ending_here = 0<br>
</ul>
<br>Loop for each element of the array:<br>
<ul>
  <li>(a) max_ending_here = max_ending_here + a[i] <br>
  <li>(b) if(max_ending_here < 0)<br>
    <ul>
            <li>max_ending_here = 0</li><br>
     </ul>
  <li>(c) if(max_so_far < max_ending_here)<br>
    <ul>
            <li>max_so_far = max_ending_here</li><br>
      </ul>
</ul>
return max_so_far<br>
 </p>
