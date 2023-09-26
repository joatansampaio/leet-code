let node = {
    value : 1,
    left: {
      value: 2,
      left: {
        value: 4
      },
      right: {
        value: 5
      }
    },
    right: {
      value: 3,
      left: {
        value: 6
      },
      right: {
        value: 7
      }
    }
  }
  
  console.log(invertTree(node))
  
  function invertTree(node){
    if(node.left === undefined && node.right === undefined)
      return;  
    let left = node.left;
    node.left = node.right;
    node.right = left;
  
    invertTree(node.left)
    invertTree(node.right)
    
    return node
  }
  