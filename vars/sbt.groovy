def call(String args) {
  sh """
    sbt -Dsbt.global.base=\$HOME/.sbt \
      -Dsbt.boot.directory=\$HOME/.sbt \
      -Dsbt.ivy.home=.ivy2 \
      $args
  """
}
