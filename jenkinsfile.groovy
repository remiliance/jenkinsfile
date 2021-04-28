node {
    stage('Clone') {
        git 'https://github.com/remiliance/projet_panier_produit.git'
    }
    stage('Build') {
        echo 'debut du build'
    }
    stage('Run') {
        echo 'debut du run'
    }
}
